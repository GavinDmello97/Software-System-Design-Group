# Contributors: Kameron


# Monitors the solutions proposed by the knowledge bases and chooses the best one
class Controller:
    def __init__(self, blackboard):
        self.blackboard = blackboard
        # init blackboard
        self.blackboard.commonState["answer"] = 0
        self.blackboard.commonState["answerCorrectness"] = 0

    def Loop(self):
        while self.blackboard.commonState["answerCorrectness"] < 10:
            print("Current Question Number:", self.blackboard.commonState["answerCorrectness"] + 1)
            # Hold the candidates to be chosen
            # Choice is made based on the higher amount
            # Allows the knowledge bases to contribute if their number is higher
            candidates = []
            for expert in self.blackboard.experts:
                eagerness = expert.CanContribute()
                if eagerness:
                    candidates.append((eagerness, expert))  # append a tuple

            candidates.sort(key=lambda x: x[0])  # sort tuples based on eagerness in ascending order
            betterAnswer = candidates[-1][1]  # Get the tuple with highest eagerness
            betterAnswer.writeAnswerOnBoard()  # The winning expert of their solution gets to write the answer on the board
        return self.blackboard.commonState["answer"]