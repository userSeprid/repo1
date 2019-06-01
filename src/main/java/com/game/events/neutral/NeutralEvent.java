package com.game.events.neutral;

import com.game.events.Event;
import com.game.events.EventType;

public interface NeutralEvent extends Event {
    public static final EventType eventType = EventType.NEUTRAL;
}
