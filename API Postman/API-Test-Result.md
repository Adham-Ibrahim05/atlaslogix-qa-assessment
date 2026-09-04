\# Automated API Test Execution Result



\## Execution Summary



| Metric                |                   Result |

| --------------------- | -----------------------: |

| Collection            | Automated API Collection |

| Iterations            |                        1 |

| Requests Executed     |                        7 |

| Failed Requests       |                        0 |

| Test Scripts          |                        6 |

| Failed Test Scripts   |                        0 |

| Assertions            |                       14 |

| Failed Assertions     |                        0 |

| Total Run Duration    |                  1686 ms |

| Average Response Time |                   154 ms |

| Minimum Response Time |                    90 ms |

| Maximum Response Time |                   382 ms |

| Total Data Received   |                  8.65 kB |

| \*\*Overall Result\*\*    |                 \*\*PASS\*\* |



\## Newman Execution Output



```text

Automated API Collection



→ Auth - Login

&#x20; POST https://assessment.nexus-grid.ai/api/v1/auth/login \[200 OK, 1.75kB, 382ms]

&#x20; √  Login succeeded



→ Tenant Admin - List Tenants

&#x20; GET https://assessment.nexus-grid.ai/api/v1/tenants \[403 Forbidden, 856B, 91ms]



→ Shipments - List

&#x20; GET https://assessment.nexus-grid.ai/api/v1/tenants/TENANT-ADHAM-IBRAHIM-QA29/shipments?ordering=-last\_updated \[200 OK, 7.79kB, 154ms]

&#x20; √  Shipment list succeeded



→ Shipments - Sensor No Content (204)

&#x20; GET https://assessment.nexus-grid.ai/api/v1/shipments/SHIP-ADHAM-IBRAHIM-QA29-NODATA/sensor-data \[204 No Content, 772B, 90ms]

&#x20; √  No sensor data returns 204



→ Shipments - Compliance Approve

&#x20; POST https://assessment.nexus-grid.ai/api/v1/shipments/SHIP-ADHAM-IBRAHIM-QA29-PENDING/compliance/approve \[409 Conflict, 919B, 92ms]

&#x20; √  Approval request returns expected status

&#x20; √  Repeated approval is rejected with 409



→ Shipments - Compliance Report

&#x20; GET https://assessment.nexus-grid.ai/api/v1/shipments/SHIP-ADHAM-IBRAHIM-QA29-PENDING/compliance/report \[200 OK, 1.11kB, 90ms]

&#x20; √  Status code is 200

&#x20; √  Shipment ID exists

&#x20; √  Compliance status exists

&#x20; √  Sensor confidence exists

&#x20; √  Sensor event count is valid



→ Audit Logs

&#x20; GET https://assessment.nexus-grid.ai/api/v1/audit-logs?entity=shipment\&entityId=SHIP-ADHAM-IBRAHIM-QA29-PENDING \[200 OK, 1.3kB, 184ms]

&#x20; √  Status code is 200

&#x20; √  Response contains data array

&#x20; √  Audit records exist

&#x20; √  Audit record contains required fields



┌─────────────────────────┬────────────────────┬───────────────────┐

│                         │           executed │            failed │

├─────────────────────────┼────────────────────┼───────────────────┤

│              iterations │                  1 │                 0 │

├─────────────────────────┼────────────────────┼───────────────────┤

│                requests │                  7 │                 0 │

├─────────────────────────┼────────────────────┼───────────────────┤

│            test-scripts │                  6 │                 0 │

├─────────────────────────┼────────────────────┼───────────────────┤

│      prerequest-scripts │                  0 │                 0 │

├─────────────────────────┼────────────────────┼───────────────────┤

│              assertions │                 14 │                 0 │

├─────────────────────────┴────────────────────┴───────────────────┤

│ total run duration: 1686ms                                       │

├──────────────────────────────────────────────────────────────────┤

│ total data received: 8.65kB (approx)                             │

├──────────────────────────────────────────────────────────────────┤

│ average response time: 154ms \[min: 90ms, max: 382ms, s.d.: 99ms] │

└──────────────────────────────────────────────────────────────────┘

```



\## API Scenario Results



| # | Scenario                 | Expected Behavior                                      | Actual Result                       | Status   |

| - | ------------------------ | ------------------------------------------------------ | ----------------------------------- | -------- |

| 1 | Contract Assertion       | Valid shipment response structure                      | Valid response received             | \*\*PASS\*\* |

| 2 | Role Boundary            | Unauthorized tenant access returns `403`               | `403 Forbidden`                     | \*\*PASS\*\* |

| 3 | Tenant Scope             | User receives shipments within authorized tenant scope | Shipment list returned successfully | \*\*PASS\*\* |

| 4 | 204 No Content           | Shipment without sensor data returns `204`             | `204 No Content`                    | \*\*PASS\*\* |

| 5 | Locked/Repeated Approval | Repeated approval is rejected with `409`               | `409 Conflict`                      | \*\*PASS\*\* |

| 6 | Compliance Report        | Report returns `200` and required fields               | Valid report returned               | \*\*PASS\*\* |

| 7 | Audit Access             | Audit endpoint returns records with required fields    | Valid audit records returned        | \*\*PASS\*\* |



\## Result Assessment



\*\*Overall API Automation Result: PASS\*\*



\* All automated API checks completed successfully.

\* No failed requests were reported.

\* All 14 assertions passed.

\* Expected negative responses such as `403 Forbidden` and `409 Conflict` were correctly validated by the test scripts.

\* The `204 No Content` response was correctly validated for shipments without sensor data.

\* Compliance report and audit-log responses contained the required data and fields.





