%%
%% Put the numbers from 1 to 9 in the circles so that the sum of the numbers on each side of a triangle is the same.
%%       X
%%      X X
%%     X   X
%%    X X X X

solve(X) :-
    fill(X, []).

fill([], [X1, X2, X3, X4, X5, X6, X7, X8, X9]) :-
    S1 is X1 + X2 + X3 + X4,
    S2 is X4 + X5 + X6 + X7,
    S3 is X7 + X8 + X9 + X1,
    S1 = S2, S2 = S3.

fill([X|T], Seen) :-
    between(1, 9, X),
    \+ member(X, Seen),
    append(Seen, [X], NextSeen),
    fill(T, NextSeen).
