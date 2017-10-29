package ppsus.backend

import grails.converters.JSON
import org.grails.web.json.JSONObject

class HealthCenterController {

    static allowedMethods = [
            create:     "POST",
            list:       "GET",
            delete:     "DELETE",
            edit:       "PUT"
    ]

    static responseFormats = ['json']
    def healthCenterService


    def create() {
        def messages = [], httpCode
        try {
            //println(request)
            def healthCenters = healthCenterService.create(request)
            //println(healthCenters)
            respond healthCenters as JSONObject
            return
        } catch (Exception ex){
            messages += ex.getMessage()
            //httpCode = ex.getHttpCode()
        }
        render(status: "666", text: ["errors":  messages] as JSON, contentType: 'application/json')
    }

    def list() {
        def messages = [], httpCode
        try {
            def healthCenters = healthCenterService.list()
            respond healthCenters as JSONObject//, [status: HttpServletResponse.SC_OK]
            return
        } catch (Exception ex){
            messages += ex.getMessage()
            //httpCode = ex.getHttpCode()
        }
        render(status: "123", text: ["errors":  messages] as JSON, contentType: 'application/json')
    }

    def delete() {

    }

    def edit() {

    }
}
