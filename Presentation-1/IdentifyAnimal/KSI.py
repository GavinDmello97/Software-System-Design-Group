import random

from AbstractExpert import *


class KSI(AbstractExpert):
    def CanContribute(self):
        return random.randint(1, 20)

    def execAction(self):
        self.blackboard.commonState["answer"] += random.randint(1, 20)
        print(".")
