class Blackboard:
    def __init__(self):
        self.experts = []
        self.facts = []
        self.result = ""

    def addFacts(self, facts):
        self.facts = facts
        print("\nThe following facts were added to the blackboard:")
        print(self.facts)
        print("\n")

    def addExpert(self, expert):
        self.experts.append(expert)
        print("Expert assigned to the blackboard\n")
