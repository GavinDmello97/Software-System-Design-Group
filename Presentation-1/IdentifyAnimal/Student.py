import random

from AbstractExpert import *

class Student(AbstractExpert):
    def CanContribute(self):
        return True
    def execAction(self):
        self.blackboard.commonState['answer'] += random.randint(1,20)
        print(".")
