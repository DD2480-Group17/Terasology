/*
 * Copyright 2020 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.nui.layers.hud;

import org.junit.jupiter.api.Test;
import org.terasology.logic.inventory.SelectedInventorySlotComponent;
import org.terasology.logic.players.LocalPlayer;
import org.terasology.rendering.nui.widgets.UIText;

import static org.junit.jupiter.api.Assertions.*;

class InventoryHudTest {

    @Test
    public void teatAnimationClass(){
        LocalPlayer localPlayer = new LocalPlayer();

        UIText text = new UIText();
        InventoryHud.AnimationThread animationThread = new InventoryHud.AnimationThread(localPlayer, text, 2000);
        Thread a = new Thread(animationThread);
        a.start();

        assertFalse(text.isVisible());
    }

}