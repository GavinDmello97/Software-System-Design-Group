from BlackBoard import *

from Controller import *
from KSI import *


blackboard = Blackboard()
blackboard.addExpert(KSI(blackboard))
c = Controller(blackboard)
result = c.Loop()
print(result)
print("done")
