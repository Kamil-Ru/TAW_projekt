Wyniki testów

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


TAW Report script - Localhost

→ Send one
  POST http://localhost:8080/IO/subject [200 OK, 123B, 152ms]
  √  Status code is 200

→ Send list
  POST http://localhost:8080/IO/subjects [200 OK, 123B, 11ms]
  √  Status code is 200

→ Get All
  GET http://localhost:8080/IO/subjects [200 OK, 658B, 23ms]
  √  Status code is 200

→ Get with exam
  GET http://localhost:8080/IO/subject?exam=true [200 OK, 323B, 8ms]
  √  Status code is 200

→ Get  with room 216
  GET http://localhost:8080/IO/subject?room=216 [200 OK, 403B, 7ms]
  √  Status code is 200
  √  Body matches string

→ No exam and room 208
  GET http://localhost:8080/IO/subject?exam=false&room=208 [200 OK, 334B, 6ms]
  √  Status code is 200
  √  Body matches string

→ Subject ID 3
  GET http://localhost:8080/IO/subject?id=3 [200 OK, 247B, 7ms]
  √  Status code is 200
  √  Body matches string

→ Subject ID 15
  GET http://localhost:8080/IO/subject?id=15 [404 Not Found, 130B, 5ms]
  √  Status code is 404

→ Subject ID 2
  GET http://localhost:8080/IO/subject?id=2 [200 OK, 242B, 6ms]
  √  Status code is 200
  √  Body matches string

→ Delete ID 2
  DELETE http://localhost:8080/IO/subject?id=2 [204 No Content, 112B, 7ms]
  √  Status code is 204

→ Delete ID 2 (secend)
  DELETE http://localhost:8080/IO/subject?id=2 [404 Not Found, 130B, 5ms]
  √  Status code is 404

→ Get All
  GET http://localhost:8080/IO/subjects [200 OK, 581B, 7ms]
  √  Status code is 200

→ Delete all
  DELETE http://localhost:8080/IO/subjects [204 No Content, 112B, 6ms]
  √  Status code is 204

→ Get All
  GET http://localhost:8080/IO/subjects [404 Not Found, 130B, 5ms]
  √  Status code is 404

┌─────────────────────────┬───────────────────┬──────────────────┐
│                         │          executed │          failed  │
├─────────────────────────┼───────────────────┼──────────────────┤
│              iterations │                 1 │                0 │
├─────────────────────────┼───────────────────┼──────────────────┤
│                requests │                14 │                0 │
├─────────────────────────┼───────────────────┼──────────────────┤
│            test-scripts │                14 │                0 │
├─────────────────────────┼───────────────────┼──────────────────┤
│      prerequest-scripts │                 0 │                0 │
├─────────────────────────┼───────────────────┼──────────────────┤
│              assertions │                18 │                0 │
├─────────────────────────┴───────────────────┴──────────────────┤
│ total run duration: 1348ms                                     │
├────────────────────────────────────────────────────────────────┤
│ total data received: 1.64kB (approx)                           │
├────────────────────────────────────────────────────────────────┤
│ average response time: 18ms [min: 5ms, max: 152ms, s.d.: 37ms] │
└────────────────────────────────────────────────────────────────┘


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

TAW Report script zdalny (Google Cloud)

→ Send one
  POST https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject [200 OK, 243B, 548ms]
  √  Status code is 200

→ Send list
  POST https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subjects [200 OK, 239B, 53ms]
  √  Status code is 200

→ Get All
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subjects [200 OK, 692B, 75ms]
  √  Status code is 200

→ Get with exam
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?exam=true [200 OK, 357B, 49ms]
  √  Status code is 200

→ Get  with room 216
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?room=216 [200 OK, 437B, 48ms]
  √  Status code is 200
  √  Body matches string

→ No exam and room 208
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?exam=false&room=208 [200 OK, 368B, 48ms]
  √  Status code is 200
  √  Body matches string

→ Subject ID 3
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?id=3 [200 OK, 281B, 46ms]
  √  Status code is 200
  √  Body matches string

→ Subject ID 15
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?id=15 [404 Not Found, 246B, 51ms]
  √  Status code is 404

→ Subject ID 2
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?id=2 [200 OK, 276B, 47ms]
  √  Status code is 200
  √  Body matches string

→ Delete ID 2
  DELETE https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?id=2 [204 No Content, 247B, 47ms]
  √  Status code is 204

→ Delete ID 2 (secend)
  DELETE https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subject?id=2 [404 Not Found, 246B, 46ms]
  √  Status code is 404

→ Get All
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subjects [200 OK, 615B, 47ms]
  √  Status code is 200

→ Delete all
  DELETE https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subjects [204 No Content, 247B, 46ms]
  √  Status code is 204

→ Get All
  GET https://taw-projekt-bfaef2ycjq-od.a.run.app/IO/subjects [404 Not Found, 246B, 46ms]
  √  Status code is 404

┌─────────────────────────┬────────────────────┬───────────────────┐
│                         │           executed │            failed │
├─────────────────────────┼────────────────────┼───────────────────┤
│              iterations │                  1 │                 0 │
├─────────────────────────┼────────────────────┼───────────────────┤
│                requests │                 14 │                 0 │
├─────────────────────────┼────────────────────┼───────────────────┤
│            test-scripts │                 14 │                 0 │
├─────────────────────────┼────────────────────┼───────────────────┤
│      prerequest-scripts │                  0 │                 0 │
├─────────────────────────┼────────────────────┼───────────────────┤
│              assertions │                 18 │                 0 │
├─────────────────────────┴────────────────────┴───────────────────┤
│ total run duration: 2.4s                                         │
├──────────────────────────────────────────────────────────────────┤
│ total data received: 1.64kB (approx)                             │
├──────────────────────────────────────────────────────────────────┤
│ average response time: 85ms [min: 46ms, max: 548ms, s.d.: 128ms] │
└──────────────────────────────────────────────────────────────────┘


