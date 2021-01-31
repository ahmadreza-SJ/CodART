"""

The main module of CodART

-changelog
-- Add C++ backend support

"""

__version__ = '0.2.0'
__author__ = 'Morteza'


import argparse
import os.path
from os import listdir

from antlr4 import *

# <<<<<<< HEAD:main.py

# from java9speedy.parser import sa_java9_v2
#
#
# def main(args):
#     # Step 1: Load input source into stream
#     stream = FileStream(args.file, encoding='utf8')
#     # input_stream = StdinStream()
#
#     # Step 2: Create an instance of AssignmentStLexer
#     lexer = Java9_v2Lexer(stream)
#     # Step 3: Convert the input source into a list of tokens
#     token_stream = CommonTokenStream(lexer)
#     # Step 4: Create an instance of the AssignmentStParser
#     parser = Java9_v2Parser(token_stream)
#     parser.getTokenStream()
#
#     # Step 5: Create parse tree
#     # 1. Python backend --> Low speed
#     # parse_tree = parser.compilationUnit()
#
#     # 2. C++ backend --> high speed
#
#     parse_tree = sa_java9_v2.parse(stream, 'compilationUnit', None)
#     quit()
#     # Step 6: Create an instance of AssignmentStListener
#     my_listener = ExtractClassRefactoringListener(common_token_stream=token_stream, class_identifier='Worker')
#
#     # return
#     walker = ParseTreeWalker()
#     walker.walk(t=parse_tree, listener=my_listener)
#
#     with open('input.refactored.java', mode='w', newline='') as f:
#         f.write(my_listener.token_stream_rewriter.getDefaultText())
# =======

from CodART.gen.javaLabeled.JavaLexer import JavaLexer
from CodART.gen.javaLabeled.JavaParserLabeled import JavaParserLabeled
# from refactorings.make_field_non_static import MakeFieldNonStaticRefactoringListener
# from refactorings.make_field_static_1 import MakeFieldStaticRefactoringListener
from refactorings.rename_class import RenameClassRefactoringListener


def main(args):

    files = get_file_dirs(args.dir)

    create_new_project_dir('JavaProjectRefactored', files)
    ref = input(" choose your refactoring :")


    for file in files:

        # Step 1: Load input source into stream



        stream = FileStream(file, encoding='utf8')
        # input_stream = StdinStream()

        # Step 2: Create an instance of AssignmentStLexer
        lexer = JavaLexer(stream)
        # Step 3: Convert the input source into a list of tokens
        token_stream = CommonTokenStream(lexer)
        # Step 4: Create an instance of the AssignmentStParser
        parser = JavaParserLabeled(token_stream)

        parser.getTokenStream()
        # Step 5: Create parse tree
        parse_tree = parser.compilationUnit()
        # Step 6: Create an instance of AssignmentStListener

        #my_listener = RenameClassRefactoringListener(common_token_stream=token_stream, class_new_name='Z',
        #                                                 class_identifier='A', package_identifier="Dummy")
        if ref == "Rename":
            print("Rename class  =>")
            my_listener = RenameClassRefactoringListener(common_token_stream=token_stream, class_new_name='Z',
                                                             class_identifier='A', package_identifier="Dummy")
        # elif ref == "Static":
        #     print("Make field static  =>")
        #     my_listener = MakeFieldStaticRefactoringListener(common_token_stream=token_stream, field_identifier='f',
        #                                                  class_identifier='A', package_identifier="Dummy")
        # elif ref == "Non Static":
        #     print("Make field Non static  =>")
        #     my_listener = MakeFieldNonStaticRefactoringListener(common_token_stream=token_stream, field_identifier='f',
        #                                                      class_identifier='A', package_identifier="Dummy")



        walker = ParseTreeWalker()
        walker.walk(t=parse_tree, listener=my_listener)

        if ref == "Non Static" and my_listener.canceled:
            rewrite_project(files, 'JavaProjectRefactored')
            break

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

def rewrite_project(source_files, dest_path):
    for file in source_files:
        with open(file, mode='r', newline='') as rf:
            splited_dir = file.split('/')
            splited_dir[0] = dest_path
            with open("/".join(splited_dir), mode='w', newline='') as f:
                f.write(rf.read())


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
