# Contributors: Atefeh


from BlackBoard import *
from Controller import *
from StudentKSI import *
from TeacherKSI import *

blackboard = Blackboard()
blackboard.addClassMember(Student(blackboard))
blackboard.addClassMember(Teacher(blackboard))
c = Controller(blackboard)
result = c.Loop()
print("All the problems were solved")
