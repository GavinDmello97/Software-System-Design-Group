class Blackboard:
    def __init__(self):
        self.experts = []
        self.commonState = {}

    def addExpert(self, expert):
        self.experts.append(expert)
