# AtlasLogix QA Assessment

## Overview

This repository contains the QA assessment deliverables for the AtlasLogix web application.

The assessment covers risk-based testing, functional validation, UI and API automation, accessibility testing, responsive behavior, defect reporting, and release recommendation.

## Application Under Test

**Application:** AtlasLogix QA Assessment Environment

**Environment:**
`https://assessment.nexus-grid.ai/qa/`

**Primary Tenant:**
`TENANT-ADHAM-IBRAHIM-QA29`

**Secondary Tenant:**
`TENANT-ADHAM-IBRAHIM-QA29-MENA`

## Scope

The testing scope included:

* Authentication and role-based access
* Role permission boundaries
* Tenant selection and tenant isolation
* Shipment discovery and details
* Compliance status and approval workflow
* Sensor data and no-data behavior
* Live sensor streaming
* Audit logs
* Compliance reports
* Keyboard navigation and focus behavior
* Responsive behavior
* UI design comparison against the provided reference
* API contract and behavior validation

## Test Approach

A risk-based testing approach was used, prioritizing:

1. Authentication and access control
2. Role-based access control and permission boundaries
3. Tenant isolation
4. Compliance and approval workflows
5. Sensor data integrity and no-data handling
6. Live streaming and recovery
7. Auditability
8. Accessibility
9. Responsive behavior
10. UI consistency with the provided design reference

## Roles & RBAC Validation

Role-based access was tested across the available application roles to verify that permissions and restricted actions were enforced correctly.

The validation included:

* Login and access behavior for the supplied roles
* Visibility of role-specific features
* Access to permitted functionality
* Restriction of unauthorized actions
* Compliance approval/denial permissions
* Tenant-level access boundaries

## Automation

### UI Automation

**Technology:**

* Selenium WebDriver
* Java
* TestNG

UI automation was used to validate key end-to-end workflows and repeatable functional scenarios.

### API Automation

**Tools:**

* Postman
* Newman

The supplied Postman collection was automated and executed using Newman to validate API behavior across authentication, authorization, tenant isolation, shipment, compliance, and audit functionality.

The API automation covers:

* Authentication context
* Role boundary validation
* Tenant scope and isolation
* Shipment data and response contract
* No-data response (`204 No Content`)
* Compliance approval and repeated/locked approval behavior
* Compliance reports
* Audit logs

Detailed API execution evidence is available in:

`API Postman Collection/API-Test-Result.md`

### Performance Testing

Performance testing was performed using Apache JMeter against the authenticated, read-only GET API workload.

The performance test was designed to measure the behavior of the primary GET endpoints while keeping authentication outside the performance workload.

The performance workload covers:

* GET Auth - Current User & Permissions
* GET Tenant Admin - List Tenants
* GET Tenant Admin - List Users
* GET Shipments - List
* GET Shipments - Detail
* GET Shipments - Sensor Latest
* GET Shipments - Sensor History
* GET Shipments - Sensor No Content (204)
* GET Shipments - Compliance Report
* GET Audit Logs

The test was intentionally limited to the assessment constraints and focused on API response performance, throughput, and error behavior under the configured load.

Detailed performance test configuration, execution results, observations, and conclusions are available in:

* `Performance Testing/AtlasLogix-QA-Assessment.jmx`
* `Performance Testing/Performance Test Report.csv`

## Accessibility

Accessibility testing included manual keyboard and focus review covering:

* Login
* Dashboard
* Shipments
* Shipment Details drawer
* Sensor chart
* Sensor error/status communication
* Compliance status communication
* Responsive behavior

## Defects

The executed testing identified defects related to:

* Login availability for the supplied non-auditor role accounts
* Shipment Details drawer keyboard focus
* Escape-key behavior
* Responsive visibility of account actions
* UI differences from the provided design reference

Detailed reproduction steps, expected/actual results, severity, priority, evidence and environment information are available in:

* `docs/Defect Report.xlsx`
* `Evidence/`

## Test Results

Detailed execution results are documented in:

* `docs/Test Strategy.md`
* `docs/Coverage Matrix.csv`

## Release Recommendation

The final release recommendation is documented separately in:

`docs/Release-Recommendation.md`

The recommendation is based on:

* Executed coverage
* Confirmed defects
* Blocked scenarios
* Accessibility findings
* Residual risks
* Follow-up testing needs

## AI Usage

AI assistance was used during preparation of this assessment for documentation support, test analysis, structuring, and review.

All testing activities, observations, defect validation, and final conclusions were personally reviewed against the application behavior and assessment requirements.
