package com.game.events.negative;

import com.game.events.Event;
import com.game.events.EventType;

public interface NegativeEvent extends Event {
    EventType EVENT_TYPE = EventType.NEGATIVE;
}
