# centrale-java

## API Pierre feuille ciseau :

Voici des exemples de requêtes à tester :

POST  http://localhost:8080/player?name=Lucas

POST  http://localhost:8080/play?player1Id=1&player2Id=2&handPlayer1=feuille&handPlayer2=ciseaux

GET  http://localhost:8080/game-stats?playerId1=1

GET  http://localhost:8080/player/1


## Composite 

J'ai choisi d'illustrer ce design Pattern en utilisant un bouquet de fleurs qui est composé de plusieurs fleurs.
L'application permet de connaître le prix du bouquet.

## Visiteur

J'ai choisi d'utiliser un zoo. Chaque animal represente une classe. L'interface AnimalVisitor permet de visiter 
ces classes.