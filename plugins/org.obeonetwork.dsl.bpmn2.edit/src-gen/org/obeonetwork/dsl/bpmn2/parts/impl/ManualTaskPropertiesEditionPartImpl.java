/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ManualTaskPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ManualTaskPropertiesEditionPart {

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
	protected Text name;
	protected ReferencesTable categoryValueRef;
	protected List<ViewerFilter> categoryValueRefBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoryValueRefFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outgoing;
	protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable incoming;
	protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();
	protected Button isForCompensation;
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer default_;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable boundaryEventRefs;
	protected List<ViewerFilter> boundaryEventRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> boundaryEventRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataInputAssociations;
	protected List<ViewerFilter> dataInputAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataInputAssociationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataOutputAssociations;
	protected List<ViewerFilter> dataOutputAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataOutputAssociationsFilters = new ArrayList<ViewerFilter>();
	protected Text startQuantity;
	protected Text completionQuantity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ManualTaskPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence manualTaskStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = manualTaskStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.outgoing);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.incoming);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.isForCompensation);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.resources);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.default_);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.properties_);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.startQuantity);
		propertiesStep.addStep(Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity);
		
		
		composer = new PartComposer(manualTaskStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.id) {
					return createIdText(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions) {
					return createExtensionDefinitionsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.extensionValues) {
					return createExtensionValuesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.documentation) {
					return createDocumentationAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.name) {
					return createNameText(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef) {
					return createCategoryValueRefAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.outgoing) {
					return createOutgoingAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.incoming) {
					return createIncomingAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.isForCompensation) {
					return createIsForCompensationCheckbox(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.resources) {
					return createResourcesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.default_) {
					return createDefault_FlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.properties_) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs) {
					return createBoundaryEventRefsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations) {
					return createDataInputAssociationsAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations) {
					return createDataOutputAssociationsAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.startQuantity) {
					return createStartQuantityText(parent);
				}
				if (key == Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity) {
					return createCompletionQuantityText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(Bpmn2Messages.ManualTaskPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ManualTask.Properties.id, Bpmn2Messages.ManualTaskPropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.ManualTask.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.id, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions, Bpmn2Messages.ManualTaskPropertiesEditionPart_ExtensionDefinitionsLabel);		 
		this.extensionDefinitions = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionDefinitions.createControls(parent);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createExtensionValuesAdvancedTableComposition(Composite parent) {
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, Bpmn2Messages.ManualTaskPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionValues.createControls(parent);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.ManualTask.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationAdvancedTableComposition(Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.documentation, Bpmn2Messages.ManualTaskPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.documentation, Bpmn2ViewsRepository.SWT_KIND));
		this.documentation.createControls(parent);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.ManualTask.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ManualTask.Properties.name, Bpmn2Messages.ManualTaskPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.ManualTask.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.name, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCategoryValueRefAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef, Bpmn2Messages.ManualTaskPropertiesEditionPart_CategoryValueRefLabel);		 
		this.categoryValueRef = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCategoryValueRef(); }
			public void handleEdit(EObject element) { editCategoryValueRef(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategoryValueRef(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategoryValueRef(element); }
			public void navigateTo(EObject element) { }
		});
		this.categoryValueRef.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef, Bpmn2ViewsRepository.SWT_KIND));
		this.categoryValueRef.createControls(parent);
		this.categoryValueRef.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryValueRefData = new GridData(GridData.FILL_HORIZONTAL);
		categoryValueRefData.horizontalSpan = 3;
		this.categoryValueRef.setLayoutData(categoryValueRefData);
		this.categoryValueRef.disableMove();
		categoryValueRef.setID(Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef);
		categoryValueRef.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCategoryValueRef() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(categoryValueRef.getInput(), categoryValueRefFilters, categoryValueRefBusinessFilters,
		"categoryValueRef", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				categoryValueRef.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCategoryValueRef(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategoryValueRef(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void editCategoryValueRef(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				categoryValueRef.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.ManualTask.Properties.outgoing, Bpmn2Messages.ManualTaskPropertiesEditionPart_OutgoingLabel);		 
		this.outgoing = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutgoing(); }
			public void handleEdit(EObject element) { editOutgoing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoing(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.outgoing, Bpmn2ViewsRepository.SWT_KIND));
		this.outgoing.createControls(parent);
		this.outgoing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
		outgoing.setID(Bpmn2ViewsRepository.ManualTask.Properties.outgoing);
		outgoing.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoing() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoing.getInput(), outgoingFilters, outgoingBusinessFilters,
		"outgoing", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.outgoing,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoing.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoing(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoing(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoing.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIncomingAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.ManualTask.Properties.incoming, Bpmn2Messages.ManualTaskPropertiesEditionPart_IncomingLabel);		 
		this.incoming = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addIncoming(); }
			public void handleEdit(EObject element) { editIncoming(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncoming(element); }
			public void navigateTo(EObject element) { }
		});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.incoming, Bpmn2ViewsRepository.SWT_KIND));
		this.incoming.createControls(parent);
		this.incoming.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
		incoming.setID(Bpmn2ViewsRepository.ManualTask.Properties.incoming);
		incoming.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncoming() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incoming.getInput(), incomingFilters, incomingBusinessFilters,
		"incoming", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.incoming,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incoming.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncoming(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncoming(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void editIncoming(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incoming.refresh();
			}
		}
	}

	
	protected Composite createIsForCompensationCheckbox(Composite parent) {
		isForCompensation = new Button(parent, SWT.CHECK);
		isForCompensation.setText(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.isForCompensation, Bpmn2Messages.ManualTaskPropertiesEditionPart_IsForCompensationLabel));
		isForCompensation.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.isForCompensation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isForCompensation.getSelection())));
			}

		});
		GridData isForCompensationData = new GridData(GridData.FILL_HORIZONTAL);
		isForCompensationData.horizontalSpan = 2;
		isForCompensation.setLayoutData(isForCompensationData);
		EditingUtils.setID(isForCompensation, Bpmn2ViewsRepository.ManualTask.Properties.isForCompensation);
		EditingUtils.setEEFtype(isForCompensation, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.isForCompensation, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourcesAdvancedTableComposition(Composite parent) {
		this.resources = new ReferencesTable(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.resources, Bpmn2Messages.ManualTaskPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.resources, Bpmn2ViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(Bpmn2ViewsRepository.ManualTask.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDefault_FlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ManualTask.Properties.default_, Bpmn2Messages.ManualTaskPropertiesEditionPart_Default_Label);
		default_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ManualTask.Properties.default_, Bpmn2ViewsRepository.SWT_KIND));
		default_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		default_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.default_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDefault_()));
			}

		});
		GridData default_Data = new GridData(GridData.FILL_HORIZONTAL);
		default_.setLayoutData(default_Data);
		default_.setID(Bpmn2ViewsRepository.ManualTask.Properties.default_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.default_, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesAdvancedTableComposition(Composite parent) {
		this.properties = new ReferencesTable(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.properties_, Bpmn2Messages.ManualTaskPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.properties_, Bpmn2ViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.properties_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(Bpmn2ViewsRepository.ManualTask.Properties.properties_);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBoundaryEventRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs, Bpmn2Messages.ManualTaskPropertiesEditionPart_BoundaryEventRefsLabel);		 
		this.boundaryEventRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addBoundaryEventRefs(); }
			public void handleEdit(EObject element) { editBoundaryEventRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBoundaryEventRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBoundaryEventRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.boundaryEventRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.boundaryEventRefs.createControls(parent);
		this.boundaryEventRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData boundaryEventRefsData = new GridData(GridData.FILL_HORIZONTAL);
		boundaryEventRefsData.horizontalSpan = 3;
		this.boundaryEventRefs.setLayoutData(boundaryEventRefsData);
		this.boundaryEventRefs.disableMove();
		boundaryEventRefs.setID(Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs);
		boundaryEventRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addBoundaryEventRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(boundaryEventRefs.getInput(), boundaryEventRefsFilters, boundaryEventRefsBusinessFilters,
		"boundaryEventRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				boundaryEventRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBoundaryEventRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		boundaryEventRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBoundaryEventRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.boundaryEventRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		boundaryEventRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editBoundaryEventRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				boundaryEventRefs.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataInputAssociationsAdvancedTableComposition(Composite parent) {
		this.dataInputAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, Bpmn2Messages.ManualTaskPropertiesEditionPart_DataInputAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataInputAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataInputAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataInputAssociations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataInputAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataInputAssociationsFilters) {
			this.dataInputAssociations.addFilter(filter);
		}
		this.dataInputAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, Bpmn2ViewsRepository.SWT_KIND));
		this.dataInputAssociations.createControls(parent);
		this.dataInputAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataInputAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		dataInputAssociationsData.horizontalSpan = 3;
		this.dataInputAssociations.setLayoutData(dataInputAssociationsData);
		this.dataInputAssociations.setLowerBound(0);
		this.dataInputAssociations.setUpperBound(-1);
		dataInputAssociations.setID(Bpmn2ViewsRepository.ManualTask.Properties.dataInputAssociations);
		dataInputAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataOutputAssociationsAdvancedTableComposition(Composite parent) {
		this.dataOutputAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, Bpmn2Messages.ManualTaskPropertiesEditionPart_DataOutputAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataOutputAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataOutputAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataOutputAssociations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataOutputAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataOutputAssociationsFilters) {
			this.dataOutputAssociations.addFilter(filter);
		}
		this.dataOutputAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, Bpmn2ViewsRepository.SWT_KIND));
		this.dataOutputAssociations.createControls(parent);
		this.dataOutputAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataOutputAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		dataOutputAssociationsData.horizontalSpan = 3;
		this.dataOutputAssociations.setLayoutData(dataOutputAssociationsData);
		this.dataOutputAssociations.setLowerBound(0);
		this.dataOutputAssociations.setUpperBound(-1);
		dataOutputAssociations.setID(Bpmn2ViewsRepository.ManualTask.Properties.dataOutputAssociations);
		dataOutputAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStartQuantityText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ManualTask.Properties.startQuantity, Bpmn2Messages.ManualTaskPropertiesEditionPart_StartQuantityLabel);
		startQuantity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData startQuantityData = new GridData(GridData.FILL_HORIZONTAL);
		startQuantity.setLayoutData(startQuantityData);
		startQuantity.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.startQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startQuantity.getText()));
			}

		});
		startQuantity.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.startQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startQuantity.getText()));
				}
			}

		});
		EditingUtils.setID(startQuantity, Bpmn2ViewsRepository.ManualTask.Properties.startQuantity);
		EditingUtils.setEEFtype(startQuantity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.startQuantity, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCompletionQuantityText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity, Bpmn2Messages.ManualTaskPropertiesEditionPart_CompletionQuantityLabel);
		completionQuantity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData completionQuantityData = new GridData(GridData.FILL_HORIZONTAL);
		completionQuantity.setLayoutData(completionQuantityData);
		completionQuantity.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, completionQuantity.getText()));
			}

		});
		completionQuantity.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ManualTaskPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, completionQuantity.getText()));
				}
			}

		});
		EditingUtils.setID(completionQuantity, Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity);
		EditingUtils.setEEFtype(completionQuantity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ManualTask.Properties.completionQuantity, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initCategoryValueRef(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategoryValueRef(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		categoryValueRef.setContentProvider(contentProvider);
		categoryValueRef.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateCategoryValueRef()
	 * 
	 */
	public void updateCategoryValueRef() {
	categoryValueRef.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInCategoryValueRefTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryValueRefTable(EObject element) {
		return ((ReferencesTableSettings)categoryValueRef.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateOutgoing()
	 * 
	 */
	public void updateOutgoing() {
	outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
		return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateIncoming()
	 * 
	 */
	public void updateIncoming() {
	incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element) {
		return ((ReferencesTableSettings)incoming.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#getIsForCompensation()
	 * 
	 */
	public Boolean getIsForCompensation() {
		return Boolean.valueOf(isForCompensation.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setIsForCompensation(Boolean newValue)
	 * 
	 */
	public void setIsForCompensation(Boolean newValue) {
		if (newValue != null) {
			isForCompensation.setSelection(newValue.booleanValue());
		} else {
			isForCompensation.setSelection(false);
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
		if (this.resources != null) {
			this.resources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#getDefault_()
	 * 
	 */
	public EObject getDefault_() {
		if (default_.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) default_.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initDefault_(EObjectFlatComboSettings)
	 */
	public void initDefault_(EObjectFlatComboSettings settings) {
		default_.setInput(settings);
		if (current != null) {
			default_.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setDefault_(EObject newValue)
	 * 
	 */
	public void setDefault_(EObject newValue) {
		if (newValue != null) {
			default_.setSelection(new StructuredSelection(newValue));
		} else {
			default_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setDefault_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefault_ButtonMode(ButtonsModeEnum newValue) {
		default_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterDefault_(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefault_(ViewerFilter filter) {
		default_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterDefault_(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefault_(ViewerFilter filter) {
		default_.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter) {
		propertiesFilters.add(filter);
		if (this.properties != null) {
			this.properties.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initBoundaryEventRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBoundaryEventRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		boundaryEventRefs.setContentProvider(contentProvider);
		boundaryEventRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateBoundaryEventRefs()
	 * 
	 */
	public void updateBoundaryEventRefs() {
	boundaryEventRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterBoundaryEventRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBoundaryEventRefs(ViewerFilter filter) {
		boundaryEventRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterBoundaryEventRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBoundaryEventRefs(ViewerFilter filter) {
		boundaryEventRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInBoundaryEventRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInBoundaryEventRefsTable(EObject element) {
		return ((ReferencesTableSettings)boundaryEventRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initDataInputAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataInputAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataInputAssociations.setContentProvider(contentProvider);
		dataInputAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateDataInputAssociations()
	 * 
	 */
	public void updateDataInputAssociations() {
	dataInputAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterDataInputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataInputAssociations(ViewerFilter filter) {
		dataInputAssociationsFilters.add(filter);
		if (this.dataInputAssociations != null) {
			this.dataInputAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterDataInputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataInputAssociations(ViewerFilter filter) {
		dataInputAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInDataInputAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataInputAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)dataInputAssociations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#initDataOutputAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataOutputAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataOutputAssociations.setContentProvider(contentProvider);
		dataOutputAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#updateDataOutputAssociations()
	 * 
	 */
	public void updateDataOutputAssociations() {
	dataOutputAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addFilterDataOutputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataOutputAssociations(ViewerFilter filter) {
		dataOutputAssociationsFilters.add(filter);
		if (this.dataOutputAssociations != null) {
			this.dataOutputAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#addBusinessFilterDataOutputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataOutputAssociations(ViewerFilter filter) {
		dataOutputAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#isContainedInDataOutputAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataOutputAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)dataOutputAssociations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#getStartQuantity()
	 * 
	 */
	public String getStartQuantity() {
		return startQuantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setStartQuantity(String newValue)
	 * 
	 */
	public void setStartQuantity(String newValue) {
		if (newValue != null) {
			startQuantity.setText(newValue);
		} else {
			startQuantity.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#getCompletionQuantity()
	 * 
	 */
	public String getCompletionQuantity() {
		return completionQuantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ManualTaskPropertiesEditionPart#setCompletionQuantity(String newValue)
	 * 
	 */
	public void setCompletionQuantity(String newValue) {
		if (newValue != null) {
			completionQuantity.setText(newValue);
		} else {
			completionQuantity.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.ManualTask_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
