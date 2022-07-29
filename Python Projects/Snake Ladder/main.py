from Dice import Dice
class Entity:
    def __init__(self,start,end):
        self.start = start
        self.end = end

class Player:
    name = ""
    pos = 0
    def __init__(self,name,pos):
        self.name = name
        self.pos = pos

class Board:
    length = 0
    boardPosDic = {}
    def __init__(self,size):
        self.length = size*size
    def addEntity(self,entity):
        if entity.start > self.length or entity.end > self.length:
            print("Invalid entity...try again")
        else:
            self.boardPosDic[entity.start] = entity.end

class Game:
    board = Board
    # dice = Dice
    players = []
    def addBoard(self,board):
        self.board = board
    def addPlayer(self,player):
        self.players.append(player)
    def addDice(self,d):
        self.dice = d
    def run(self):
        # print("Game on with")
        # print("Board of size", board.length)
        # print("Players are")
        # for p in self.players:
        #     print(p.name)
        # print("Entities at")
        # for start,end in self.board.boardPosDic.items():
        #     print(f'Start at {start} and end at {end}')
        print("press key to start game", input())
        while len(self.players):
            player = self.players.pop(0)
            nextMove = dice.rollDice()
            print("dice rolled:",nextMove)
            expPos = player.pos + nextMove
            if expPos > board.length:
                self.players.append(player)
                print(f'{player.name} is at position {player.pos}')
                continue
            if expPos in self.board.boardPosDic:
                player.pos = self.board.boardPosDic[expPos]
            else:
                player.pos = expPos
            if player.pos == board.length:
                print(f'Bravo!!! {player.name} won the Game')
                print("Players left",self.players)
                continue
            self.players.append(player)
            print(f'{player.name} is at position {player.pos}')



board = Board(5)
snake1 = Entity(8,2)
snake2 = Entity(16,9)
ladder1 = Entity(3,7)
ladder1 = Entity(10,25)
player1 = Player("Sachin",0)
player2 = Player("Tom",0)
board.addEntity(snake1)
board.addEntity(snake2)
board.addEntity(ladder1)
game = Game()
dice = Dice()
game.addDice(dice)
game.addBoard(board)
game.addPlayer(player1)
game.addPlayer(player2)
game.run()