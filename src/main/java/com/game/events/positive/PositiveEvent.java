package com.game.events.positive;

import com.game.events.Event;
import com.game.events.EventType;

public interface PositiveEvent extends Event {
    public static final EventType eventType = EventType.POSITIVE;
}
