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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class DataOutputAssociationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DataOutputAssociationPropertiesEditionPart {

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
	protected ReferencesTable assignment;
	protected List<ViewerFilter> assignmentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assignmentFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer targetRef;
	protected ReferencesTable sourceRef;
	protected List<ViewerFilter> sourceRefBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sourceRefFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DataOutputAssociationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence dataOutputAssociationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = dataOutputAssociationStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef);
		
		
		composer = new PartComposer(dataOutputAssociationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.id) {
					return createIdText(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions) {
					return createExtensionDefinitionsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues) {
					return createExtensionValuesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation) {
					return createDocumentationAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment) {
					return createAssignmentAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef) {
					return createTargetRefFlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef) {
					return createSourceRefAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.DataOutputAssociation.Properties.id, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.DataOutputAssociation.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.id, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_ExtensionDefinitionsLabel);		 
		this.extensionDefinitions = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionDefinitions.createControls(parent);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionValues.createControls(parent);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.DataOutputAssociation.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationAdvancedTableComposition(Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, Bpmn2ViewsRepository.SWT_KIND));
		this.documentation.createControls(parent);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.DataOutputAssociation.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAssignmentAdvancedTableComposition(Composite parent) {
		this.assignment = new ReferencesTable(getDescription(Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_AssignmentLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				assignment.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				assignment.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				assignment.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				assignment.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.assignmentFilters) {
			this.assignment.addFilter(filter);
		}
		this.assignment.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, Bpmn2ViewsRepository.SWT_KIND));
		this.assignment.createControls(parent);
		this.assignment.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assignmentData = new GridData(GridData.FILL_HORIZONTAL);
		assignmentData.horizontalSpan = 3;
		this.assignment.setLayoutData(assignmentData);
		this.assignment.setLowerBound(0);
		this.assignment.setUpperBound(-1);
		assignment.setID(Bpmn2ViewsRepository.DataOutputAssociation.Properties.assignment);
		assignment.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_TargetRefLabel);
		targetRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef, Bpmn2ViewsRepository.SWT_KIND));
		targetRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetRef()));
			}

		});
		GridData targetRefData = new GridData(GridData.FILL_HORIZONTAL);
		targetRef.setLayoutData(targetRefData);
		targetRef.setID(Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.targetRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSourceRefAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef, Bpmn2Messages.DataOutputAssociationPropertiesEditionPart_SourceRefLabel);		 
		this.sourceRef = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSourceRef(); }
			public void handleEdit(EObject element) { editSourceRef(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSourceRef(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSourceRef(element); }
			public void navigateTo(EObject element) { }
		});
		this.sourceRef.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef, Bpmn2ViewsRepository.SWT_KIND));
		this.sourceRef.createControls(parent);
		this.sourceRef.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sourceRefData = new GridData(GridData.FILL_HORIZONTAL);
		sourceRefData.horizontalSpan = 3;
		this.sourceRef.setLayoutData(sourceRefData);
		this.sourceRef.disableMove();
		sourceRef.setID(Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef);
		sourceRef.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSourceRef() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sourceRef.getInput(), sourceRefFilters, sourceRefBusinessFilters,
		"sourceRef", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sourceRef.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSourceRef(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sourceRef.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSourceRef(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataOutputAssociationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.DataOutputAssociation.Properties.sourceRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sourceRef.refresh();
	}

	/**
	 * 
	 */
	protected void editSourceRef(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sourceRef.refresh();
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#initAssignment(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssignment(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		assignment.setContentProvider(contentProvider);
		assignment.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#updateAssignment()
	 * 
	 */
	public void updateAssignment() {
	assignment.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addFilterAssignment(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssignment(ViewerFilter filter) {
		assignmentFilters.add(filter);
		if (this.assignment != null) {
			this.assignment.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addBusinessFilterAssignment(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssignment(ViewerFilter filter) {
		assignmentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#isContainedInAssignmentTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssignmentTable(EObject element) {
		return ((ReferencesTableSettings)assignment.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#getTargetRef()
	 * 
	 */
	public EObject getTargetRef() {
		if (targetRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#initTargetRef(EObjectFlatComboSettings)
	 */
	public void initTargetRef(EObjectFlatComboSettings settings) {
		targetRef.setInput(settings);
		if (current != null) {
			targetRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#setTargetRef(EObject newValue)
	 * 
	 */
	public void setTargetRef(EObject newValue) {
		if (newValue != null) {
			targetRef.setSelection(new StructuredSelection(newValue));
		} else {
			targetRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#setTargetRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetRefButtonMode(ButtonsModeEnum newValue) {
		targetRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addFilterTargetRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetRef(ViewerFilter filter) {
		targetRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addBusinessFilterTargetRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetRef(ViewerFilter filter) {
		targetRef.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#initSourceRef(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSourceRef(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sourceRef.setContentProvider(contentProvider);
		sourceRef.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#updateSourceRef()
	 * 
	 */
	public void updateSourceRef() {
	sourceRef.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addFilterSourceRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSourceRef(ViewerFilter filter) {
		sourceRefFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#addBusinessFilterSourceRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSourceRef(ViewerFilter filter) {
		sourceRefBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DataOutputAssociationPropertiesEditionPart#isContainedInSourceRefTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceRefTable(EObject element) {
		return ((ReferencesTableSettings)sourceRef.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.DataOutputAssociation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
