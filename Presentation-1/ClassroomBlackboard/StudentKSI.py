# Contributors: Gavin

from KnowledgeSource import *
import random


# Student knowledge source
class Student(KnowledgeSource):

    # Checker to see if student can contribute
    def CanContribute(self):
        student = random.randint(1, 20)  # student can always contribute but the eargerness of contributing varies
        print("Student eagerness value:", student)
        return student

    # when the student executes their action, the answers count for the current question increases by 1
    def writeAnswerOnBoard(self):
        self.blackboard.commonState["answer"] += 1
        print("Student wrote their answer on the board"),
