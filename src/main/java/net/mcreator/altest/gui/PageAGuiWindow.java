
package net.mcreator.altest.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.altest.AltestMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PageAGuiWindow extends ContainerScreen<PageAGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageAGui.guistate;

	public PageAGuiWindow(PageAGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 218;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("altest:textures/page_a.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Altest Help Book", 63, 5, -7601921);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 26, 110, 20, new StringTextComponent("Go to the recipes"), e -> {
			if (true) {
				AltestMod.PACKET_HANDLER.sendToServer(new PageAGui.ButtonPressedMessage(0, x, y, z));
				PageAGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 114, 110, 20, new StringTextComponent("-----------------"), e -> {
			if (true) {
				AltestMod.PACKET_HANDLER.sendToServer(new PageAGui.ButtonPressedMessage(1, x, y, z));
				PageAGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 92, 110, 20, new StringTextComponent("-----------------"), e -> {
			if (true) {
				AltestMod.PACKET_HANDLER.sendToServer(new PageAGui.ButtonPressedMessage(2, x, y, z));
				PageAGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 70, 110, 20, new StringTextComponent("-----------------"), e -> {
			if (true) {
				AltestMod.PACKET_HANDLER.sendToServer(new PageAGui.ButtonPressedMessage(3, x, y, z));
				PageAGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 48, 110, 20, new StringTextComponent("-----------------"), e -> {
			if (true) {
				AltestMod.PACKET_HANDLER.sendToServer(new PageAGui.ButtonPressedMessage(4, x, y, z));
				PageAGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 136, 110, 20, new StringTextComponent("Close"), e -> {
			if (true) {
				AltestMod.PACKET_HANDLER.sendToServer(new PageAGui.ButtonPressedMessage(5, x, y, z));
				PageAGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
