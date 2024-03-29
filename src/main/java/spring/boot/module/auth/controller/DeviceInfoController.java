package spring.boot.module.auth.controller;

import org.springframework.web.bind.annotation.*;
import spring.boot.core.api.CoreController;
import spring.boot.core.api.ResponseDTO;
import spring.boot.module.auth.dto.DeviceInfoDTO;
import spring.boot.module.auth.entity.DeviceInfoEntity;
import spring.boot.module.auth.service.DeviceInfoService;

@RequestMapping("/device-info")
@RestController
@CrossOrigin
public class DeviceInfoController extends CoreController<DeviceInfoDTO, DeviceInfoEntity,DeviceInfoService> {
    public DeviceInfoController(DeviceInfoService s) {
        super(s);
    }

    @GetMapping("/check-logout/{id}")
    public ResponseDTO checkLogout(@PathVariable Long id){
        return response(service.checkLogoutDevice(id));
    }

}
