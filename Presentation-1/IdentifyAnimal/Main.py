from BlackBoard import *

from Controller import *
from KSI import *


blackboard = Blackboard()
input("Enter the file path that contains the facts")
blackboard.addExpert(KSI(blackboard))
c = Controller(blackboard)
result = c.Loop()
print(result)
print("done")
