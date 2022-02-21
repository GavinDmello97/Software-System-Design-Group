import random

from AbstractExpert import *

class Researcher(AbstractExpert):
    
    def CanContribute(self):
        if self.blackboard.commonState['answer']:
            return True
        else:
            return False
    def execAction(self):
        self.blackboard.commonState['answer'] += 1
        self.blackboard.commonState['answerCorrectness'] += 5
        print('*')