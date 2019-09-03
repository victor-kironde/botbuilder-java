package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
import com.microsoft.bot.schema.ResourceResponse;

import java.util.concurrent.Callable;

@FunctionalInterface
public interface UpdateActivityHandler {
    /**
     * A method that can participate in update activity events for the current turn.
     * @param context The context object for the turn.
     * @param activity The replacement activity.
     * @param next The delegate to call to continue event processing.
     * @return A task that represents the work queued to execute.
     * A handler calls the {@code next} delegate to pass control to
     * the next registered handler. If a handler doesn’t call the next delegate,
     * the adapter does not call any of the subsequent handlers and does not update the
     * activity.
     * <p>The activity's {@link Activity#getId} indicates the activity in the
     * conversation to replace.</p>
     *
     * {@linkalso BotAdapter}
     * {@linkalso SendActivitiesHandler}
     * {@linkalso DeleteActivityHandler}
     */
    ResourceResponse handle(TurnContext context, Activity activity, Callable<ResourceResponse> next);
}
