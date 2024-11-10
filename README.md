You need to add a Person class to hold necessary info about users of our app. What fields and methods would this class hold?

id, name, username, password
Would you need to add any additional classes to Person to make the app work? If so, what classes would be necessary?

meetup! category, add meetup  events & a signin form, 
What kinds of relationships would Person have to the other classes you already created, such as the Event class?

Person would have a one-to-many relationship with the Events class (would include Meetup!)
Then there should be some sort of list of attendees which would be a Many-to-One relationship for each individual Meetup! Event.
Then there should be a Many-to-Many type of relationship between all events and all people.
