#!/bin/bash
PARTY=$(daml ledger list-parties --host "localhost" --port 6865 | grep "Alice" | sed -n "s/.*$party = '\([^']*\)'.*$/\1/p")
DAML_LEDGER_URL="localhost:6865" DAML_LEDGER_PARTY=$PARTY DAML_LEDGER_ID=sandbox java -jar target/hub-example-javabot-0.0.1-jar-with-dependencies.jar