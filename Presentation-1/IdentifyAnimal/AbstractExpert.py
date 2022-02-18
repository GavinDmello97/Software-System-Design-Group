class AbstractExpert:
    def __init__(
        self,
        blackboard,
    ):
        self.blackboard = blackboard

    def CanContribute(self):
        raise "not implemented"

    def execAction(self):
        raise "not implemented"
