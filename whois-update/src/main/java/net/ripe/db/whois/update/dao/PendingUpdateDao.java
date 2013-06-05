package net.ripe.db.whois.update.dao;

import net.ripe.db.whois.common.rpsl.ObjectType;
import net.ripe.db.whois.update.domain.PendingUpdate;

import java.util.List;

public interface PendingUpdateDao {
    List<PendingUpdate> findByTypeAndKey(ObjectType type, String key);
    void store(PendingUpdate pendingUpdate);
    void remove(PendingUpdate pendingUpdate);
}
