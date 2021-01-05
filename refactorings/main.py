import argparse
import os.path
from os import listdir

from antlr4 import *

from refactorings.make_field_static_1 import MakeFieldStaticRefactoringListener
from refactorings.gen.Java9_v2Lexer import Java9_v2Lexer
from refactorings.gen.Java9_v2Parser import Java9_v2Parser


def main(args):

    files = get_file_dirs(args.dir)

    create_new_project_dir('JavaProjectRefactored', files)


    for file in files:

        # Step 1: Load input source into stream



        stream = FileStream(file, encoding='utf8')
        # input_stream = StdinStream()

        # Step 2: Create an instance of AssignmentStLexer
        lexer = Java9_v2Lexer(stream)
        # Step 3: Convert the input source into a list of tokens
        token_stream = CommonTokenStream(lexer)
        # Step 4: Create an instance of the AssignmentStParser
        parser = Java9_v2Parser(token_stream)

        parser.getTokenStream()
        # Step 5: Create parse tree
        parse_tree = parser.compilationUnit()
        # Step 6: Create an instance of AssignmentStListener
        my_listener = MakeFieldStaticRefactoringListener(common_token_stream=token_stream, field_identifier='f',
                                                         class_identifier='A', package_identifier="Dummy")
        walker = ParseTreeWalker()
        walker.walk(t=parse_tree, listener=my_listener)

        splited_dir = file.split('/')
        splited_dir[0] = 'JavaProjectRefactored'
        with open("/".join(splited_dir), mode='w', newline='') as f:
            f.write(my_listener.token_stream_rewriter.getDefaultText())


def get_file_dirs(path):
    dirs = []
    for f in listdir(path):
        cur_dir = path + "/" + f
        if os.path.isdir(cur_dir):
            dirs += get_file_dirs(cur_dir)
        elif os.path.isfile(cur_dir):
            dirs.append(cur_dir)

    return dirs


def create_new_project_dir(base_path, files):
    if not os.path.exists(base_path):
        os.mkdir(base_path)

    for file in files:
        curr_dir=base_path + '/'
        dirs = file.split('/')
        for i in range(1, len(dirs) - 1):
            curr_dir += dirs[i] + '/'

            if not os.path.exists(curr_dir):
                os.mkdir(curr_dir)
        # parent_dir = base_path


if __name__ == '__main__':
    argparser = argparse.ArgumentParser()
    argparser.add_argument(
        '-n', '--dir',
        help='Input source', default=r'JavaProject')
    args = argparser.parse_args()
    main(args)
