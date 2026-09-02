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
2. Tenant isolation
3. Compliance and approval workflows
4. Sensor data integrity and no-data handling
5. Live streaming and recovery
6. Auditability
7. Accessibility
8. Responsive behavior
9. UI consistency with the provided design reference

## Automation

### UI Automation

**Technology:**

* Selenium WebDriver
* Java
* TestNG

### API Automation

**Tool:**

* Postman

The supplied Postman collection was executed to validate API behavior including:

* Authentication context
* Tenant context
* Shipment data
* Sensor history
* No-data response (`204 No Content`)
* Compliance reports
* Compliance approval and locking
* Audit logs
* Sensor stream ticket behavior
* Invalid stream ticket handling


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

Detailed reproduction steps, expected/actual results, severity, priority, and environment information are available in:

`docs/Defect Report.xlsx`

## Test Results

Detailed execution results are documented in:

* `docs/Test Strategy.md`
* `docs/Coverage Matrix.csv`

## Release Recommendation

The final release recommendation is documented separately in:

`docs/release-recommendation.md`

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
