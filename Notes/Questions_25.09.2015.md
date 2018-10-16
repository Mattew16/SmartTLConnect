* Can the datatype intersectionStatus (using exclusive identifiers) be used without being associated with a controller?

>**R:** Yes. Probably. Need to test further.

* Can we have access to a sGuard test server for development?

>**R:** Yes.

* Do we need to develop a Client side software to be used on sGuard side and handle communication to the Server part of the software?

>**R:** No. Check next question.

* Do we need to develop another Server and Client if we want to have bidirecional communication?

>**R:** No, the commmunications are simple enough that cant be sent with the client.

* If we used an APN on the 3rd party controllers are the siemens servers able to handle the extra traffic?

>**R:** Server needs to request for information in order t control the amount of data being sent. 1Gb/month per controller.

* Is an APN a feasible solution for the communication between the controllers and the data source (Server)?

>**R:** Yes.
