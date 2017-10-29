package ppsus.backend

import grails.converters.JSON
import org.grails.web.json.JSONObject
import javax.servlet.http.HttpServletResponse

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
            healthCenterService.create(request)
            messages += ["message": "Health Center created successfully!"]
        } catch (Exception ex) {
            messages += ["message:": ex.message]
        }
        render(status: httpCode, text: ["messages":  messages] as JSON, contentType: 'application/json')
    }

    def list() {
        def messages = [], httpCode
        try {
            def healthCenters = healthCenterService.list()
            respond healthCenters as JSONObject
        } catch (Exception ex) {
            messages += ["message:": ex.message]
        }
        render(status: httpCode, text: ["errors":  messages] as JSON, contentType: 'application/json')
    }

    def delete() {

    }

    def edit() {

    }
}
