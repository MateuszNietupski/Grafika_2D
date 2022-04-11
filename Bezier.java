package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

class Bezier extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        Path2D.Double M = new Path2D.Double();
        M.moveTo(84,289);
        M.curveTo(131,301,137,129,130,116);
        M.curveTo(123 , 103 , 200 , 208 , 180 , 224 );
        M.curveTo(168 , 233 , 237 , 145 , 228 , 128 );
        M.curveTo(221 , 115 , 247 , 275 , 264 , 297 );
        M.curveTo(273 , 309 , 213 , 227 , 223 , 203 );
        M.curveTo(229 , 189 , 192 , 257 , 184 , 270 );
        M.curveTo(176 , 283 , 158 , 227 , 150 , 214 );
        M.curveTo(142 , 201 , 127 , 288 , 92 , 296 );
        M.curveTo(77 , 296 , 525, 387 , 355 , 293 );
        M.curveTo(352 , 289 , 369 , 274 , 376 , 296 );
        M.curveTo(375 , 311 , 400 , 165 , 386 , 173 );
        M.curveTo(380 , 159 , 465 , 301 , 449 , 306 );
        M.curveTo(453 , 319 , 475 , 145 , 473 , 160 );
        M.curveTo(469 , 145 , 467 , 180 , 451 , 249 );
        M.curveTo(443 , 261 , 387 , 131 , 379 , 143 );
        M.curveTo(382 , 138 , 356 , 307 , 354 , 292 );
        g2d.draw(M);
    }
}