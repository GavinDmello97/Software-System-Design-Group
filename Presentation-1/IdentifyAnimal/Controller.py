class Controller:
    def __init__(self, blackboard):
        self.blackboard = blackboard
        # init blackboard
        # self.blackboard.commonState["answer"] = 0
        # self.blackboard.commonState["answerCorrectness"] = 0

    def Loop(self):
        # while self.blackboard.commonState["answerCorrectness"] < 90:
        #     candidates = []
        #     for expert in self.blackboard.experts:
        #         eagerness = expert.CanContribute()
        #         if eagerness:
        #             candidates.append((eagerness, expert))  # append a tuple

        #     candidates.sort()  # move winning tuple to the end of the list
        #     winningExpert = candidates[-1][1]  # -1 means the last item in list.
        #     winningExpert.execAction()

        return self.blackboard.commonState["answer"]
