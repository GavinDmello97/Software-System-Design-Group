# Contributors: Gavin

from KnowledgeSource import *
import random


class Teacher(KnowledgeSource):

    # the teacher can contribute if their answer value is over 10 as they would like to be confident
    # and give the student time to solve
    def CanContribute(self):
        if self.blackboard.commonState["answer"] > 10:
            teacher = random.randint(1, 20)
            print("Teacher eagerness value:", teacher)
            return teacher
        else:
            return False

    def writeAnswerOnBoard(self):
        self.blackboard.commonState["answer"] += 1
        print("Answer:", self.blackboard.commonState['answer'])
        self.blackboard.commonState["answerCorrectness"] += 1
        print("Teacher wrote the correct answer for question ", self.blackboard.commonState["answerCorrectness"],  "\n")
