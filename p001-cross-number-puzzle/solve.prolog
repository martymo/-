%% swi-prolog
%%
%% Fill in the cross number puzzle using the following numbers:
%%
%% 2 digits: 24, 27, 31, 54, 59, 99
%% 4 digits: 1975, 1991, 1992, 4351
%%
%% ```
%% [ ][ ]
%%    [ ][ ]
%%    [ ][ ]
%%    [ ][ ][ ][ ]
%%       [ ][ ][ ][ ]
%%                [ ]
%% ```

number(2, 4, 24). % number 24 is made up by 2 and 4.
number(2, 7, 27).
number(3, 1, 31).
number(5, 4, 54).
number(5, 9, 59).
number(9, 9, 99).
number(1, 9, 7, 5, 1975).
number(1, 9, 9, 1, 1991).
number(1, 9, 9, 2, 1992).
number(4, 3, 5, 1, 4351).

%% Use a matrix to label each digit in the cross number puzzle.
%% `Xrc`, where r is the row and c is the column both starting from 0.
%%
%% [X00][X01]
%%      [X11][X12]
%%      [X21][X22]
%%      [X31][X32][X33][X34]
%%           [X42][X43][X44][X45]
%%                          [X55]

%% Also label each number as Nds, where d is the number of digits in
%% the number and s is the sequence.
%%
%% For example, N21 is a 2 digit number that is made up by X00 and X01
%% and it will match.
%%
solve :-
    number(X00, X01, N21), number(X11, X12, N22),
    number(X21, X22, N23),
    number(X31, X32, X33, X34, N41),
    number(X42, X43, X44, X45, N42),
    number(X01, X11, X21, X31, N43),
    number(X12, X22, X32, X42, N44),
    number(X33, X43, N24),
    number(X34, X44, N25),
    number(X45, X55, N26),
    is_unique([N21, N22, N23, N24, N25, N26]),
    is_unique([N41, N42, N43, N44]),
    display(X00, X01,
                 X11, X12,
                 X21, X22,
                 X31, X32, X33, X34,
                      X42, X43, X44, X45,
                                     X55).

is_unique(X) :-
    length(X, XL),
    list_to_set(X, Y),
    length(Y, YL),
    XL = YL.

display(X00, X01, X11, X12, X21, X22, X31, X32, X33, X34, X42, X43, X44, X45, X55) :-
    print(X00), print(X01), writeln(""),
    write(" "), print(X11), print(X12), writeln(""),
    write(" "), print(X21), print(X22), writeln(""),
    write(" "), print(X31), print(X32), print(X33), print(X34), writeln(""),
    write(" "), write(" "), print(X42), print(X43), print(X44), print(X45), writeln(""),
    write(" "), write(" "), write(" "), write(" "), write(" "), print(X55), writeln("").
