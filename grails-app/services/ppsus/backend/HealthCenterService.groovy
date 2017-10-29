package ppsus.backend

import grails.gorm.transactions.Transactional

@Transactional
class HealthCenterService {

    //HealthCenter healthCenter = new HealthCenter()

    def list() {
        List<HealthCenter>  healthCenters = HealthCenter.list()
        return [
                'healthCenters': healthCenters
        ]
    }
    def create(request) {
        def data = request.JSON
        def healthCenterName = String.valueOf(data.name)

        HealthCenter healthCenter = HealthCenter.findByName(healthCenterName)
        if(healthCenter == null) {
            healthCenter = new HealthCenter()
            healthCenter.name = data.name
            healthCenter.address = data.address
            healthCenter.neighborhood = data.neighborhood
            healthCenter.number = data.number
            healthCenter.cep = data.cep
            healthCenter.phone = data.phone
            healthCenter.validate()
            if(!healthCenter.hasErrors()) {
                healthCenter = healthCenter.save(flush: true)
            } else {
                throw new Exception("Unable to save the Health Center!")
            }

        }
        return  [
                'healthCenter': healthCenter,
                'response': "Health Center created successfully!"
        ]
    }
}
