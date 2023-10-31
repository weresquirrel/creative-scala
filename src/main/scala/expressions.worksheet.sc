// --------------------------------------
// Mezei muveletek
// --------------------------------------
1 + 2
100 + 24
1 + 43 - 2
1 + 2 * 3

'a'
true

// short string
"Lorem ipsum"

// multiline string
"""
A new, a vast, and a powerful language is developed for the future use of analysis,
in which to wield its truths so that these may become of more speedy and accurate
practical application for the purposes of mankind than the means hitherto in our
possession have rendered possible.

  -- Ada Lovelace
"""
// --------------------------------------
// division like in C++
// --------------------------------------
// !!!
1 / 2

// yeah, yeah
1 / 2.0
1.0 / 2.0

// --------------------------------------
// Text manipulation
// --------------------------------------
"Lorem ipsum dolor sit amet".toUpperCase

"Gilgamesh went abroad in the world".take(12)
"Gilgamesh went abroad in the world".substring(12)
"Gilgamesh went abroad in the world".substring(5, 14)

//same
// NB. basically:
// a b c equals a.b(c)
1 + 2
1.+(2)

// hence =>
"Gilgamesh" substring 4
"Gilgamesh".substring(4)

// Below is a quote from Wuthering Heights. Write an expression to extract
// "leave me in this abyss" from this String.

"""
  Be with me always—take any form—drive me mad! 
  only do not leave me in this abyss, where I cannot find you!"
""".substring(76, 98)

"It is a truth ".++("universally acknowledged")
// same as
"It is a truth " ++ "universally acknowledged"
