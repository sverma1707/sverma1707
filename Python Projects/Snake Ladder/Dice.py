import random
class Dice:
    value = 1
    # def __init__(self,value):
    #     self.value = value
    def rollDice(self):
        return random.randint(self.value,6*self.value)
