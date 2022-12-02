/**
 * Open Service Broker API
 * The Open Service Broker API defines an HTTP(S) interface between Platforms and Service Brokers.
 *
 * OpenAPI spec version: master - might contain changes that are not yet released
 * Contact: open-service-broker-api@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

package io.swagger.server.model

case class ServiceInstanceProvisionRequest(
  service_id: String,
    plan_id: String,
    context: Option[Context],
    organization_guid: String,
    space_guid: String,
    parameters: Option[Object],
    maintenance_info: Option[MaintenanceInfo]
  )