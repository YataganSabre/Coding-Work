# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab8_Act2-1
# Date: 20/3/19
from math import*
data = [[   0  ,  0.0009977  ,  0.04   ,  5.03   ,  0.0001 ,  0.0009952  ,  0.12   ,  10.07  ,  0.0003 ],  # line__0
[ 20 ,  0.0009996  ,  83.61  ,  88.61  ,  0.2954    ],  # line__1
[ 40 ,  0.0010057  ,  166.92 ,  171.95 ,  0.5705    ],  # line__2
[ 60 ,  0.0010149  ,  250.29 ,  255.36 ,  0.8287    ],  # line__3
[ 80 ,  0.0010267  ,  333.82 ,  338.96 ,  1.0723    ],  # line__4
[ 100    ,  0.0010410  ,  417.65 ,  422.85 ,  1.3034 ,  ],  # line__5
[ 120    ,  0.0010576  ,  501.91 ,  507.19 ,  1.5236 ,  ],  # line__6
[ 140    ,  0.0010769  ,  586.8  ,  592.18 ,  1.7344 ,  ],  # line__7
[ 160    ,  0.0010988  ,  672.55 ,  678.04 ,  1.9374 ,  ],  # line__8
[ 180    ,  0.0011240  ,  759.47 ,  765.09 ,  2.1338 ,  ],  # line__9
[ 200    ,  0.0011531  ,  847.92 ,  853.68 ,  2.3251 ,  ],  # line__10
[ 220    ,  0.0011868  ,  938.39 ,  944.32 ,  2.5127 ,  ],  # line__11
[ 240    ,  0.0012268  ,  1031.6 ,  1037.7 ,  2.6983 ,  ],  # line__12
[ 260    ,  0.0012755  ,  1128.5 ,  1134.9 ,  2.8841 ,  ]  # line___13
]

T = float(input('input T:'))

ind1 = int(T//20)
ind2 = ind1+1

# print(ind1, ind2) # keeping this here just in case a reference is needed
if T < 260:
    x0 = data[ind1][0]
    y0 = data[ind1][3]
    x1 = data[ind2][0]
    y1 = data[ind2][3]
    x = T
    y = (y0 * (x1 - x) + y1 * (x - x0)) / (x1 - x0)
    print(y)
elif T == 260:
    s = data[ind1][3]