# Contributors: Atefeh


# Blackboard holds all of the solutions
class Blackboard:
    def __init__(self):
        self.experts = []
        self.commonState = {}

    def AddExpert(self, expert):
        self.experts.append(expert)
