from BlackBoard import *

from Controller import *
from KSI import *


blackboard = Blackboard()
# eg: /Users/gavindmello/Documents/UMASSD/Sem\ 2/SSD/SSD-group-tasks/Presentation-1/facts.txt
file = None
while file == None or file.readable() == False:
    try:
        facts_file_path = input("Enter the file path that contains the facts: ")
        file = open(facts_file_path, "r")
    except (FileNotFoundError, IOError):
        print("File path not found")

facts = []
for line in file:
    if not line.strip():
        continue
    if line:
        facts.append(line.strip())

blackboard.addFacts(facts)
# blackboard.addExpert(KSI(blackboard))

print("Controller Initialized\n")
# c = Controller(blackboard)
# result = c.Loop()
# print(result)
# print("done")
