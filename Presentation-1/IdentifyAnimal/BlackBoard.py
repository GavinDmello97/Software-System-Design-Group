class Blackboard:
    def __init__(self):
        self.experts = []
        self.commonState = {}
        self.facts = []
        self.conclusion = ""

    def addExpert(self, expert):
        self.experts.append(expert)
