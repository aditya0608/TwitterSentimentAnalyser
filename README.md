
# REQUIREMENTS


```
CONTROLLER
```

* Show top ‘N’ used words in the last  (1,2,3…..24 hours) hourly,weekly ,monthly ,yearly tweets.
* Pick tweets containing a list of words (Implement pagination).
* Pick tweets by a certain userID.
* Display tweets by region (not in MVP).
* Implement API gateway.

```
CONSUMER SERVICE (KAFKA)
```

* Implement 3 consumers within a consumer group to consume tweets from twitter api.
* Use a custom serializer and deserializer.
* Persist tweets inside the database.

```
CACHING
```

* Implement cache to prevent lookup in DB all the time.


# NOT IN MVP

```
UI
```

* Implement login screen.
* Show the results over the screen for various API’s.
* Give a functionality to create tweets.

    
