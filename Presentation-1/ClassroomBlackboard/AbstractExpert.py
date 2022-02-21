# Contributors: Kameron


# The basic knowledge source
class AbstractExpert:
    def __init__(self, blackboard):
        self.blackboard = blackboard

    def CanContribute(self):
        raise ("not implemented")

    def writeAnswerOnBoard(self):
        raise ("not implemented")
