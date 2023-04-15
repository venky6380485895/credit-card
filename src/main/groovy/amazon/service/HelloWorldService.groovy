package amazon.service

import org.springframework.stereotype.Service

@Service
class HelloWorldService {
    String getMessage() {
        return 'Hello World'
    }
}
