/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class RelationshipPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RelationshipPropertiesEditionPart {

	protected Text id;
	protected ReferencesTable extensionDefinitions;
	protected List<ViewerFilter> extensionDefinitionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionDefinitionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable extensionValues;
	protected List<ViewerFilter> extensionValuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionValuesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable documentation;
	protected List<ViewerFilter> documentationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> documentationFilters = new ArrayList<ViewerFilter>();
	protected Text type;
	protected EMFComboViewer direction;
	protected ReferencesTable sources;
	protected List<ViewerFilter> sourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable targets;
	protected List<ViewerFilter> targetsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> targetsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public RelationshipPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RelationshipPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence relationshipStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = relationshipStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.type);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.direction);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.sources);
		propertiesStep.addStep(Bpmn2ViewsRepository.Relationship.Properties.targets);
		
		
		composer = new PartComposer(relationshipStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.Relationship.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.direction) {
					return createDirectionEMFComboViewer(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.sources) {
					return createSourcesReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Relationship.Properties.targets) {
					return createTargetsReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(Bpmn2Messages.RelationshipPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Relationship.Properties.id, Bpmn2Messages.RelationshipPropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							RelationshipPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Relationship.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RelationshipPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Relationship.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RelationshipPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.Relationship.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions, Bpmn2Messages.RelationshipPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions);
		extensionDefinitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExtensionDefinitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(extensionDefinitions.getInput(), extensionDefinitionsFilters, extensionDefinitionsBusinessFilters,
		"extensionDefinitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				extensionDefinitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExtensionDefinitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void editExtensionDefinitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				extensionDefinitions.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createExtensionValuesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Relationship.Properties.extensionValues, Bpmn2Messages.RelationshipPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.Relationship.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Relationship.Properties.documentation, Bpmn2Messages.RelationshipPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.Relationship.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Relationship.Properties.type, Bpmn2Messages.RelationshipPropertiesEditionPart_TypeLabel);
		type = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		type.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							RelationshipPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Relationship.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RelationshipPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Relationship.Properties.type,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, type.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RelationshipPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		type.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, Bpmn2ViewsRepository.Relationship.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.type, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDirectionEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Relationship.Properties.direction, Bpmn2Messages.RelationshipPropertiesEditionPart_DirectionLabel);
		direction = new EMFComboViewer(parent);
		direction.setContentProvider(new ArrayContentProvider());
		direction.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData directionData = new GridData(GridData.FILL_HORIZONTAL);
		direction.getCombo().setLayoutData(directionData);
		direction.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.direction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDirection()));
			}

		});
		direction.setID(Bpmn2ViewsRepository.Relationship.Properties.direction);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.direction, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.sources = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Relationship.Properties.sources, Bpmn2Messages.RelationshipPropertiesEditionPart_SourcesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSources(); }
			public void handleEdit(EObject element) { editSources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSources(element); }
			public void navigateTo(EObject element) { }
		});
		this.sources.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.sources, Bpmn2ViewsRepository.FORM_KIND));
		this.sources.createControls(parent, widgetFactory);
		this.sources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.sources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sourcesData = new GridData(GridData.FILL_HORIZONTAL);
		sourcesData.horizontalSpan = 3;
		this.sources.setLayoutData(sourcesData);
		this.sources.disableMove();
		sources.setID(Bpmn2ViewsRepository.Relationship.Properties.sources);
		sources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sources.getInput(), sourcesFilters, sourcesBusinessFilters,
		"sources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.sources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.sources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.sources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sources.refresh();
	}

	/**
	 * 
	 */
	protected void editSources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createTargetsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.targets = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Relationship.Properties.targets, Bpmn2Messages.RelationshipPropertiesEditionPart_TargetsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addTargets(); }
			public void handleEdit(EObject element) { editTargets(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTargets(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTargets(element); }
			public void navigateTo(EObject element) { }
		});
		this.targets.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Relationship.Properties.targets, Bpmn2ViewsRepository.FORM_KIND));
		this.targets.createControls(parent, widgetFactory);
		this.targets.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.targets, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData targetsData = new GridData(GridData.FILL_HORIZONTAL);
		targetsData.horizontalSpan = 3;
		this.targets.setLayoutData(targetsData);
		this.targets.disableMove();
		targets.setID(Bpmn2ViewsRepository.Relationship.Properties.targets);
		targets.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTargets() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(targets.getInput(), targetsFilters, targetsBusinessFilters,
		"targets", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.targets,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				targets.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTargets(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.targets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		targets.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTargets(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RelationshipPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Relationship.Properties.targets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		targets.refresh();
	}

	/**
	 * 
	 */
	protected void editTargets(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				targets.refresh();
			}
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExtensionDefinitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensionDefinitions.setContentProvider(contentProvider);
		extensionDefinitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initExtensionValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensionValues.setContentProvider(contentProvider);
		extensionValues.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesFilters.add(filter);
		if (this.extensionValues != null) {
			this.extensionValues.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDocumentation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		documentation.setContentProvider(contentProvider);
		documentation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDocumentation(ViewerFilter filter) {
		documentationFilters.add(filter);
		if (this.documentation != null) {
			this.documentation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#getDirection()
	 * 
	 */
	public Enumerator getDirection() {
		Enumerator selection = (Enumerator) ((StructuredSelection) direction.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#initDirection(Object input, Enumerator current)
	 */
	public void initDirection(Object input, Enumerator current) {
		direction.setInput(input);
		direction.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#setDirection(Enumerator newValue)
	 * 
	 */
	public void setDirection(Enumerator newValue) {
		direction.modelUpdating(new StructuredSelection(newValue));
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#initSources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sources.setContentProvider(contentProvider);
		sources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#updateSources()
	 * 
	 */
	public void updateSources() {
	sources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addFilterSources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSources(ViewerFilter filter) {
		sourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addBusinessFilterSources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSources(ViewerFilter filter) {
		sourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#isContainedInSourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourcesTable(EObject element) {
		return ((ReferencesTableSettings)sources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#initTargets(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTargets(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		targets.setContentProvider(contentProvider);
		targets.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#updateTargets()
	 * 
	 */
	public void updateTargets() {
	targets.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addFilterTargets(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargets(ViewerFilter filter) {
		targetsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#addBusinessFilterTargets(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargets(ViewerFilter filter) {
		targetsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.RelationshipPropertiesEditionPart#isContainedInTargetsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetsTable(EObject element) {
		return ((ReferencesTableSettings)targets.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.Relationship_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
