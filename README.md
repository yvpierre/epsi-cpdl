# Snowboards & Co 

## Article API
### POST /create
Crée un article dans le catalogue

### GET /get?id=\<id\>
Retourne un article si présent dans le catalogue, null sinon

### GET /getAll
Retourne tous les articles du catalogue

### GET /getAllFromCategory?category=\<category\>
Retourne tous les articles d'une catégorie

### POST /update
Met à jour un article du catalogue

### DELETE /delete?id=\<id\>
Supprime un article du catalogue

## Command API
### POST /create
Crée une commande

### GET /get?id=\<id\>
Retourne une commande si présente, null sinon

### GET /getAll
Retourne toutes les commandes

### GET /getAllFromCustomer?buyerEmail=\<email\>
Retourne toutes les commandes d'un client

### POST /{id}/
Met à jour une commande

### UPDATE /confirm/{id}/
Confirme une commande

### DELETE /{id}/
Supprime une commande