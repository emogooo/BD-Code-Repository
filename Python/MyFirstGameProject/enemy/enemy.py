import pygame
import math

class Enemy:
    imgs = []

    def __init__(self, x, y, width, height):
        self.x = x
        self.y = y
        self.width = width
        self.height = height
        self.animation_count = 0
        self.health = 1
        self.vel = 3
        self.path = [(11, 184), (206, 182), (439, 213), (544, 134), (668, 52), (876, 69), (943, 217), (875, 312), (770, 329), (681, 378), (690, 443), (781, 495), (736, 586), (675, 661), (573, 616), (485, 543), (396, 573), (317, 529), (245, 566), (179, 644), (104, 652), (26, 597), (0, 587)]
        self.path_pos = 0
        self.img = None

    def draw(self, win):
        self.animation_count += 1
        self.img = self.imgs[self.animation_count]

        if self.animation_count >= len(self.imgg):
            self.animation_count = 0

        win.blit(self.img, (self.x, self.y))
        self.move()

    def collide(self, X, Y):
        if X < self.x + self.width and X >= self.x:
            if Y <= self.y + self.height and Y >= self.y:
                return True

    def move(self, change):
        x1,y1 = self.path[self.path_pos]
        if self.path_pos + 1 == len(self.path):
            x2, y2 = (-20, 587)
        else:
            x2, y2 = self.path[self.path_pos + 1]

        change_x = x2 - x1
        change_y = y2 - y1

        math.tan(change_y / change_x)

        self.path_pos += 1

    def hit(self):
        self.health -= 1

        if self.health <= 0:
            return True