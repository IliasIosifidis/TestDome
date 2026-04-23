package alertService;

import java.util.Date;
import java.util.UUID;

public class AlertService {
  private final AlertDao storage;

  AlertService(AlertDao storage) {
    this.storage = storage;
  }

  public UUID raiseAlert() {
    return this.storage.addAlert(new Date());
  }

  public Date getAlertTime(UUID id) {
    return this.storage.getAlert(id);
  }
}