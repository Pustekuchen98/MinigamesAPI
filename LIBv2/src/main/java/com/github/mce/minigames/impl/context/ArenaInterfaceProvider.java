/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.github.mce.minigames.impl.context;

import com.github.mce.minigames.api.arena.ArenaInterface;
import com.github.mce.minigames.api.arena.rules.MinigameEvent;
import com.github.mce.minigames.api.cmd.CommandInterface;
import com.github.mce.minigames.api.context.ContextHandlerInterface;
import com.github.mce.minigames.api.context.MinigameContext;

/**
 * Provider to calculate arena for context.
 * 
 * @author mepeisen
 */
public class ArenaInterfaceProvider implements ContextHandlerInterface<ArenaInterface>
{
    
    /* (non-Javadoc)
     * @see com.github.mce.minigames.api.ContextHandlerInterface#calculateFromCommand(com.github.mce.minigames.api.cmd.CommandInterface, com.github.mce.minigames.api.MinigameContext)
     */
    @Override
    public ArenaInterface calculateFromCommand(CommandInterface command, MinigameContext context)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ArenaInterface calculateFromEvent(MinigameEvent<?, ?> event, MinigameContext context)
    {
        return event.getArena();
    }
    
}
